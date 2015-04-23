
  package gen;
  public class H_Gen19 {
  		@com.google.inject.Inject
  		public H_Gen19(H_Gen20 h_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  