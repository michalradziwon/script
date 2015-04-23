
  package gen;
  public class H_Gen84 {
  		@com.google.inject.Inject
  		public H_Gen84(H_Gen85 h_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  