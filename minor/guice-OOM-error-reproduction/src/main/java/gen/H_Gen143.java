
  package gen;
  public class H_Gen143 {
  		@com.google.inject.Inject
  		public H_Gen143(H_Gen144 h_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  