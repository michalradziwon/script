
  package gen;
  public class F_Gen86 {
  		@com.google.inject.Inject
  		public F_Gen86(F_Gen87 f_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  