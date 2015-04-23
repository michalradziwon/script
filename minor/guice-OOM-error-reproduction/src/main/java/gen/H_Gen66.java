
  package gen;
  public class H_Gen66 {
  		@com.google.inject.Inject
  		public H_Gen66(H_Gen67 h_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  