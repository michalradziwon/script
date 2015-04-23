
  package gen;
  public class F_Gen114 {
  		@com.google.inject.Inject
  		public F_Gen114(F_Gen115 f_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  