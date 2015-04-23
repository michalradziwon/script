
  package gen;
  public class O_Gen184 {
  		@com.google.inject.Inject
  		public O_Gen184(O_Gen185 o_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  