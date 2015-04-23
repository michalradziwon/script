
  package gen;
  public class H_Gen21 {
  		@com.google.inject.Inject
  		public H_Gen21(H_Gen22 h_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  