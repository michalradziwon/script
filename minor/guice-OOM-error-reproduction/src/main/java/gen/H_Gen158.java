
  package gen;
  public class H_Gen158 {
  		@com.google.inject.Inject
  		public H_Gen158(H_Gen159 h_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  