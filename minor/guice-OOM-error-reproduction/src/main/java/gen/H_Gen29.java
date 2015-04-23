
  package gen;
  public class H_Gen29 {
  		@com.google.inject.Inject
  		public H_Gen29(H_Gen30 h_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  