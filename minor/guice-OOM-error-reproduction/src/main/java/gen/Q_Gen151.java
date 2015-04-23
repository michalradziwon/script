
  package gen;
  public class Q_Gen151 {
  		@com.google.inject.Inject
  		public Q_Gen151(Q_Gen152 q_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  