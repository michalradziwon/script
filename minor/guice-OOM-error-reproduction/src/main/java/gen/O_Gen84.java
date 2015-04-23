
  package gen;
  public class O_Gen84 {
  		@com.google.inject.Inject
  		public O_Gen84(O_Gen85 o_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  