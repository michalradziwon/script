
  package gen;
  public class D_Gen194 {
  		@com.google.inject.Inject
  		public D_Gen194(D_Gen195 d_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  