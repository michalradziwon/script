
  package gen;
  public class D_Gen21 {
  		@com.google.inject.Inject
  		public D_Gen21(D_Gen22 d_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  