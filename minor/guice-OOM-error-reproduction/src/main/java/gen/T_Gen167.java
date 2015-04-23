
  package gen;
  public class T_Gen167 {
  		@com.google.inject.Inject
  		public T_Gen167(T_Gen168 t_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  