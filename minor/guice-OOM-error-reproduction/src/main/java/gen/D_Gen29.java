
  package gen;
  public class D_Gen29 {
  		@com.google.inject.Inject
  		public D_Gen29(D_Gen30 d_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  