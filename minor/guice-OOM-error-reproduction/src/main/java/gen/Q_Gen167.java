
  package gen;
  public class Q_Gen167 {
  		@com.google.inject.Inject
  		public Q_Gen167(Q_Gen168 q_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  