
  package gen;
  public class D_Gen192 {
  		@com.google.inject.Inject
  		public D_Gen192(D_Gen193 d_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  