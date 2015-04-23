
  package gen;
  public class O_Gen175 {
  		@com.google.inject.Inject
  		public O_Gen175(O_Gen176 o_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  