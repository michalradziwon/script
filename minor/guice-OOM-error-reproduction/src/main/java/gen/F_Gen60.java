
  package gen;
  public class F_Gen60 {
  		@com.google.inject.Inject
  		public F_Gen60(F_Gen61 f_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  