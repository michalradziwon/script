
  package gen;
  public class H_Gen70 {
  		@com.google.inject.Inject
  		public H_Gen70(H_Gen71 h_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  