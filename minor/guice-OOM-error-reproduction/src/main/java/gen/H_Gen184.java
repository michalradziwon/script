
  package gen;
  public class H_Gen184 {
  		@com.google.inject.Inject
  		public H_Gen184(H_Gen185 h_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  