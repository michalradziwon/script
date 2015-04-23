
  package gen;
  public class T_Gen151 {
  		@com.google.inject.Inject
  		public T_Gen151(T_Gen152 t_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  