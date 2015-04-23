
  package gen;
  public class D_Gen86 {
  		@com.google.inject.Inject
  		public D_Gen86(D_Gen87 d_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  