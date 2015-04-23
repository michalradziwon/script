
  package gen;
  public class H_Gen94 {
  		@com.google.inject.Inject
  		public H_Gen94(H_Gen95 h_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  