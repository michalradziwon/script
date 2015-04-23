
  package gen;
  public class F_Gen112 {
  		@com.google.inject.Inject
  		public F_Gen112(F_Gen113 f_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  