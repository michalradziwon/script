
  package gen;
  public class D_Gen189 {
  		@com.google.inject.Inject
  		public D_Gen189(D_Gen190 d_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  