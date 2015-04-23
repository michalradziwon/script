
  package gen;
  public class Q_Gen166 {
  		@com.google.inject.Inject
  		public Q_Gen166(Q_Gen167 q_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  