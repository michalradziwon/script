
  package gen;
  public class H_Gen15 {
  		@com.google.inject.Inject
  		public H_Gen15(H_Gen16 h_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  