
  package gen;
  public class O_Gen125 {
  		@com.google.inject.Inject
  		public O_Gen125(O_Gen126 o_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  