
  package gen;
  public class F_Gen26 {
  		@com.google.inject.Inject
  		public F_Gen26(F_Gen27 f_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  