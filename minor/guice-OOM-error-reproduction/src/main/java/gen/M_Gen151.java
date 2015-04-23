
  package gen;
  public class M_Gen151 {
  		@com.google.inject.Inject
  		public M_Gen151(M_Gen152 m_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  