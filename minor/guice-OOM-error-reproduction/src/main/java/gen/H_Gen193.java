
  package gen;
  public class H_Gen193 {
  		@com.google.inject.Inject
  		public H_Gen193(H_Gen194 h_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  