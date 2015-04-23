
  package gen;
  public class H_Gen3 {
  		@com.google.inject.Inject
  		public H_Gen3(H_Gen4 h_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  