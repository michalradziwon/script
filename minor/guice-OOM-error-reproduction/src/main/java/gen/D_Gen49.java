
  package gen;
  public class D_Gen49 {
  		@com.google.inject.Inject
  		public D_Gen49(D_Gen50 d_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  