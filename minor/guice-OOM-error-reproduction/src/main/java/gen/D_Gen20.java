
  package gen;
  public class D_Gen20 {
  		@com.google.inject.Inject
  		public D_Gen20(D_Gen21 d_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  