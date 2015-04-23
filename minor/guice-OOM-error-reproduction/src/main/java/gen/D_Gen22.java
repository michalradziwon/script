
  package gen;
  public class D_Gen22 {
  		@com.google.inject.Inject
  		public D_Gen22(D_Gen23 d_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  