
  package gen;
  public class H_Gen16 {
  		@com.google.inject.Inject
  		public H_Gen16(H_Gen17 h_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  