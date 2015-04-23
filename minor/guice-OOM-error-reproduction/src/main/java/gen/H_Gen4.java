
  package gen;
  public class H_Gen4 {
  		@com.google.inject.Inject
  		public H_Gen4(H_Gen5 h_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  