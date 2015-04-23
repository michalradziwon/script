
  package gen;
  public class D_Gen100 {
  		@com.google.inject.Inject
  		public D_Gen100(D_Gen101 d_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  