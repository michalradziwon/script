
  package gen;
  public class H_Gen180 {
  		@com.google.inject.Inject
  		public H_Gen180(H_Gen181 h_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  