
  package gen;
  public class F_Gen125 {
  		@com.google.inject.Inject
  		public F_Gen125(F_Gen126 f_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  