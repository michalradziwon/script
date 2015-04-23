
  package gen;
  public class H_Gen72 {
  		@com.google.inject.Inject
  		public H_Gen72(H_Gen73 h_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  