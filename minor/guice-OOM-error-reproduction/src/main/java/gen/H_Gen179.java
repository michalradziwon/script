
  package gen;
  public class H_Gen179 {
  		@com.google.inject.Inject
  		public H_Gen179(H_Gen180 h_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  