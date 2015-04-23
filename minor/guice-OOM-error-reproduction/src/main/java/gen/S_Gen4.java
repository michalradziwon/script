
  package gen;
  public class S_Gen4 {
  		@com.google.inject.Inject
  		public S_Gen4(S_Gen5 s_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  