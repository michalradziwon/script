
  package gen;
  public class F_Gen167 {
  		@com.google.inject.Inject
  		public F_Gen167(F_Gen168 f_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  