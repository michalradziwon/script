
  package gen;
  public class T_Gen152 {
  		@com.google.inject.Inject
  		public T_Gen152(T_Gen153 t_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  