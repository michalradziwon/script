
  package gen;
  public class H_Gen20 {
  		@com.google.inject.Inject
  		public H_Gen20(H_Gen21 h_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  