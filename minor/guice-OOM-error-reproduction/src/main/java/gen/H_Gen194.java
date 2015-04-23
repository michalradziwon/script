
  package gen;
  public class H_Gen194 {
  		@com.google.inject.Inject
  		public H_Gen194(H_Gen195 h_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  