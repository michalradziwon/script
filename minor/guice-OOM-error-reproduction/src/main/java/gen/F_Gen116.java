
  package gen;
  public class F_Gen116 {
  		@com.google.inject.Inject
  		public F_Gen116(F_Gen117 f_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  