
  package gen;
  public class F_Gen61 {
  		@com.google.inject.Inject
  		public F_Gen61(F_Gen62 f_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  