
  package gen;
  public class B_Gen184 {
  		@com.google.inject.Inject
  		public B_Gen184(B_Gen185 b_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  