
  package gen;
  public class T_Gen166 {
  		@com.google.inject.Inject
  		public T_Gen166(T_Gen167 t_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  