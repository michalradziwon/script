
  package gen;
  public class H_Gen171 {
  		@com.google.inject.Inject
  		public H_Gen171(H_Gen172 h_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  