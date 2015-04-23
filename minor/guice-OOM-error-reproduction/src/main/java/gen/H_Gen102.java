
  package gen;
  public class H_Gen102 {
  		@com.google.inject.Inject
  		public H_Gen102(H_Gen103 h_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  